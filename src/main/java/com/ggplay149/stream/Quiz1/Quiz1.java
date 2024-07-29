package com.ggplay149.stream.Quiz1;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Quiz1 {

    // 1.1 각 취미를 선호하는 인원이 몇 명인지 계산하여라.
    public Map<String, Integer> quiz1() throws IOException {
        List<String[]> csvLines = readCsvLines();
        return csvLines.stream()
                .map(row->row[1].replaceAll("\\s",""))
                .flatMap(hobby -> Arrays.stream(hobby.split(":")))
                .collect(Collectors.toMap(hobby->hobby,hobby->1,(oldValue,newValue)-> newValue += oldValue));
    }

    // 1.2 각 취미를 선호하는 정씨 성을 갖는 인원이 몇 명인지 계산하여라.
    public Map<String, Integer> quiz2() throws IOException {
        List<String[]> csvLines = readCsvLines();
        return csvLines.stream()
                .filter(row->row[0].startsWith("jung"))
                .map(row->row[1].replaceAll("\\s",""))
                .flatMap(hobby -> Arrays.stream(hobby.split(":")))
                .collect(Collectors.toMap(hobby->hobby,hobby->1,(oldValue,newValue)-> newValue += oldValue));
    }

    // 1.3 소개 내용에 '좋아'가 몇번 등장하는지 계산하여라.
    public int quiz3() throws IOException {
        List<String[]> csvLines = readCsvLines();
        return csvLines.stream()
                .map(row -> countContains(row[2],0))
                .reduce(0,Integer::sum);
    }

    private List<String[]> readCsvLines() throws IOException {
        CSVReader csvReader = new CSVReader(new FileReader(getClass().getResource("/user.csv").getFile()));
        csvReader.readNext();
        return csvReader.readAll();
    }

    private int countContains(String src, int fromIdx){
        String Target = "like";
        int index = src.indexOf(Target,fromIdx);
        if(index>=0){
            return 1+countContains(src,index+Target.length());
        }
        return 0;
    }

}
