package ru.samsung.itschool.mdev;

import com.google.gson.Gson;
import ru.samsung.itschool.mdev.model.Answer;
import ru.samsung.itschool.mdev.model.Laureate;

import javax.net.ssl.HttpsURLConnection;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        // https://api.nobelprize.org/2.1/nobelPrize/phy/2010

        String category = "phy"; // Physics
        int year = 2010;
        String url = "https://api.nobelprize.org/2.1/nobelPrize/" + category + "/" + year;

        HttpsURLConnection connection;
        URL u = new URL(url);
        connection = (HttpsURLConnection) u.openConnection();
        connection.setConnectTimeout(10000);
        connection.connect();

        int status = connection.getResponseCode();
        System.out.println(status);

        ArrayList<String> lines = new ArrayList<>();
        if(status == 200) {
            Scanner scan = new Scanner(connection.getInputStream());
            while(scan.hasNext()) {
                lines.add(scan.nextLine());
            }
        }
        String pathsave = "result.txt";
        Path path = Path.of(pathsave);
       // Files.createFile(path);
        Files.write(path,lines);

        List<String> readlines = Files.readAllLines(path);
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<readlines.size();i++) {
            stringBuilder.append(readlines.get(i));
        }
        Gson gson = new Gson();
        Answer[] answer = gson.fromJson(stringBuilder.toString(),Answer[].class);
        System.out.println(answer.length);
        System.out.println(answer[0].getAwardYear());
        List<Laureate> laureates = answer[0].getLaureates();
        System.out.println(laureates.get(0).getKnownName().getEn());
        System.out.println(laureates.get(1).getKnownName().getEn());
    }
}
