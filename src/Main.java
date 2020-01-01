

public class Main {

    public static void main(String[] args) {


        /*
        System.out.println("Java Rocks!");
        System.out.println(2+5);

        int passenger =0;
        passenger = passenger + 5;
        passenger = passenger - 3;
        passenger = passenger - 1 + 5;
        System.out.println(passenger);

        int stops = 0;
        int fare = 0;
        stops = stops +1;
        fare = fare +5;
        stops = stops +1;
        fare = fare +3;
        stops = stops +1;
        fare = fare +7;
        System.out.println("stops : "+stops);



        //Casting
        int current = 17;
        double rate = 15;
        double future = current * rate;
        System.out.println(future);
        //convert double to int
        int convertedDouble = (int) future;
        System.out.println(convertedDouble);

        double convertedInt = (double) current;
        System.out.println(convertedInt);


        //Calculate the average
        double maths=97.5;
        double english=98;
        double science=83.5;
        double drama=75;
        double music = 96;
        double sum=maths+english+science+drama+music;
        double average=sum/5;
        System.out.println(average);


        //Question 3 Problem Set
        int bankBalance = 500;
        bankBalance = bankBalance +250;
        bankBalance = bankBalance-100;
        System.out.println(bankBalance);

        //Question 5
        int day;
        String month;
        day = 19;
        month = "July";
        System.out.println(day+" "+month);


        //Question 6
        String firstName = "Mohtadi";
        String lastName = "Nasri";
        String fullName = firstName +" "+ lastName;
        System.out.println("Hello, my name is "+fullName+".");
        int nameLength = fullName.length();
        System.out.println("There are "+nameLength+" letters in my name.");


        //Question 7
        double fahrenheit =68.0;
        double celsius = ((fahrenheit-32)*5)/9;
        System.out.println(celsius);


        Boolean isCold = false;
        if(isCold){
            System.out.println("the weather is cold");
        }


        Boolean isRaining = true;
        if(isRaining){
            double carSpeed = 100;
            System.out.println("Windshield wipers on.");
            System.out.println("Car Speed" + carSpeed);
        }
        carSpeed



        Boolean isLightGreen = false;
        Boolean isLightYellow = true;
        if(isLightGreen) {
            System.out.println("Drive");
        }else if(isLightYellow){
            System.out.println("Slow Down");
        }else{
            System.out.println("Stop");
        }


        int ticketPrice = 10;
        int age = 30;
        Boolean isStudent = true;
        if(age <= 15 || age > 60 || isStudent){
            ticketPrice = 5;
            System.out.println("you pay half of the price " + ticketPrice+" $");
        }else {
            System.out.println("you should pay "+ ticketPrice+" $");
        }


        String sthgToEat;
        String amHungry = "hot chocolat";
        switch(amHungry){
            case "chocolate":
                sthgToEat = "i want chocolate";
                break;
            case "hot chocolat":
                //sthgToEat = "I want hot chocolat";
                //break;
            case "double cheeseburger":
                sthgToEat = "I want double cheeseburger";
                break;
            default:
                sthgToEat = "we got nothing from what you want";
            break;
        }
        System.out.println(sthgToEat);


        int month =13; // should be a number 1-12
        String monthString = "";

        switch(month) {
            case 1: monthString = "January";
                break;
            case 2: monthString = "February";
                break;
            case 3: monthString = "March";
                break;
            case 4: monthString = "April";
                break;
            case 5: monthString = "May";
                break;
            case 6: monthString = "June";
                break;
            case 7: monthString = "July";
                break;
            case 8: monthString = "August";
                break;
            case 9: monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            // write case 12 and a default case below
            case 12: monthString = "December";
                break;
            default:
                System.out.println("Invalid Month");
                break;
        }
        System.out.println(monthString);


        Boolean canSeePlayer = true;
        Boolean playerPoweredUp = true;
        if (canSeePlayer) {
            if (!playerPoweredUp ) {
                System.out.println("Attack!");
            } else {
                System.out.println("Run away!");
            }
        } else {
            System.out.println("Wander.");
        }

        Boolean isSnowing = false;
        Boolean isRaining = true;
        double temperature = 60;
        if(isRaining || isSnowing || temperature < 50){
            System.out.println("Let’s stay home!");
        }else{
            System.out.println("Let’s go out!");
        }



        double time = 1;
        String timeofTheDay;
        if(time >= 5 && time < 12){
            timeofTheDay = "morning";
            System.out.println(timeofTheDay);
        }else if(time >= 12 && time < 20){
            System.out.println("daytime");
        }
        else{
            System.out.println("night");
        }

        //WRONNNNNNNNG
        int weekday = 5;
        boolean holiday = true;
        switch (weekday){
            case 1:
            break;
            case 2:
            break;
            case 3:
            break;
            case 4:
            break;
            case 5:
            if(holiday){
                System.out.println("Wake up at 7:00");
            }else{
                System.out.println("Sleep in!");
            }
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                break;
        }

        int weekday = 5;
        boolean holiday = false;
        if(weekday>=1 && weekday <=5 && !holiday){
            System.out.println("Wake up at 7:00");
        }else{
            System.out.println("Sleep in!");
        }


        //Ex7
        double playbackPosition = 120;
        boolean rewinding = true;
        if (rewinding) {
            double rewindAmount = 0.1;playbackPosition = playbackPosition - rewindAmount;
        }

        System.out.println(playbackPosition);}


        //Qu8
        int dayOfWeek = 12;
        String schedule;
        switch (dayOfWeek){
            case 1:
                schedule = "Gym in the morning.";
                break;
            case 2:
                schedule = "Class after work.";
                break;
            case 7:
                schedule = "Free!" ;
                break;
            default:
                schedule = "Free!" ;
                break;
        }
        System.out.println(schedule);

        */


        IntroToJavaProgramming introToJavaProgramming = new IntroToJavaProgramming();

        //introToJavaProgramming.chorus();
        //introToJavaProgramming.doGreeting("PARIS");

        //int temperature = 36;
        //introToJavaProgramming.weatherInterpreter(temperature);

        //int currentLikes = introToJavaProgramming.likePhoto(0,"Thank you buddy!", true);
        //System.out.println(currentLikes);
        //int totalLikes = introToJavaProgramming.likePhoto(currentLikes,"Thank you buddy!", true);
        //System.out.println(totalLikes);

        //double change = introToJavaProgramming.makeChange(5.2,10.0);
        //System.out.println(change);

        //int randomValue1 = introToJavaProgramming.rollDice();
        //int randomValue2 = introToJavaProgramming.rollDice();
        //System.out.println("Rolling  Dice \n First: "+randomValue1 +" | Second: " + randomValue2);

        //int randomValue = introToJavaProgramming.rollDice(12);
        //System.out.println("Rolling the Dice: " +randomValue);

        //double absoluteValue = introToJavaProgramming.absoluteValue(-11);
        //System.out.println(absoluteValue);

        //double mealcost = introToJavaProgramming.calculateTip(15);
        //System.out.println(mealcost);

        //String greeting = introToJavaProgramming.nameTagText("Mohtadi");
        //System.out.println(greeting);

        //double temperatureFehrToCelcuis = introToJavaProgramming.fahrenheitToCelsius(60.0);
        //System.out.println(temperatureFehrToCelcuis);

        //introToJavaProgramming.printTemperature(60.0);

        //introToJavaProgramming.alarm();

        //String concatLength = introToJavaProgramming.stringLength();
        //System.out.println(concatLength);

        //int result = introToJavaProgramming.keeprolling();
        //System.out.println(result);

        //introToJavaProgramming.raiseAlarm(5);
        //introToJavaProgramming.raiseAlarmFor(5);
        //int blocksNum = introToJavaProgramming.countBlocks(3);
        //System.out.println(blocksNum);

        //String randomName = introToJavaProgramming.chooseRandom();
        //System.out.println(randomName);

        //String [] names = {"mohtadi Nasri", "Mom", "Nasri", "Oups!"};
        //String result = introToJavaProgramming.findLongestName(names);
        //System.out.println(result);

        //int fact = introToJavaProgramming.factorial(5);
        //System.out.println(fact);

        //String[] sentence = {"Learning", "Java", "is", "fun."};
        //int indexOfWordJava = introToJavaProgramming.indexOfFirstOccurrence(sentence, "Learning");
        //System.out.println(indexOfWordJava);

        //int years = introToJavaProgramming.yearsTilOneMillion(10);
        //System.out.println(years);


        // Problem Set 4 : Question 5
        //String[] week =  {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        //introToJavaProgramming.printInReverse(week);

    }
}
