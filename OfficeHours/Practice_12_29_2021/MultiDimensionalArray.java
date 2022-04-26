package Practice_12_29_2021;

import java.util.Arrays;

public class MultiDimensionalArray {


    public static void main(String[] args) {

        String[] scrum1 = {"Aysegul","Timur","Oleksandr","Jilili"};

        String[] scrum2 = {"Ali","Olga"};

        String[] scrum3 = {"Sergei","Yuliya","Farangez"};

        String [][] scrumTeams = {{"Aysegul","Timur","Oleksandr","Jilili"},{"Ali","Olga"},{"Sergei","Yuliya","Farangez"}};
        //{scrum1,scrum2,scrum3}

        System.out.println(Arrays.deepToString(scrumTeams));

        System.out.println(scrumTeams[1][1]);

        for(String [] eachScrum : scrumTeams){
            System.out.println(Arrays.toString(eachScrum));
        }

        for(String[] eachScrum: scrumTeams){
            for(String eachName: eachScrum){
                System.out.println(eachName);
            }
        }

    }
}
