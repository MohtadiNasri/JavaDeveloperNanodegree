public class Starter {

    boolean playButton = false;
    public void chorus() {
        if(playButton){
        System.out.println("Music is playing");
        }else{
            System.out.println("Music is paused");
        }

    }


    public void doGreeting(String location){
        System.out.println("Hello "+location);
    }

    public static void weatherInterpreter(int temperature){
        if(temperature>30){
            System.out.println("It's hot outside");
        }else if(temperature<5){
            System.out.println("Brr, consider wearing a jacket.");
        }else{
            System.out.println("Not too hot, not too cold.");
        }
    }

    public int likePhoto(int currentLikes, String comment, boolean like){
        System.out.println("Feedback: "+ comment);
        if(like){
            currentLikes = currentLikes+1;
        }
        System.out.println("Number of likes: "+currentLikes);
        return currentLikes;
    }

    public double makeChange(double itemCost, double dollarsProvided){
        double change = dollarsProvided - itemCost;
        return  change;
    }
    public int rollDice(){
        double randomNumber = Math.random();
        randomNumber  = randomNumber * 6 + 1;
        int diceValue = (int) randomNumber;
        return diceValue;
    }

    public int rollDice(int sides){
        // random num between 0 and (almost) 1
        double randomNumber=Math.random();

        // change range to 0 to (almost) 6
        randomNumber=randomNumber*sides;

        // shift range up one
        randomNumber=randomNumber+1;

        // cast to integer (ignore decimal part)
        // ex. 6.998 becomes 6
        int randomInt=(int)randomNumber;

        // return statement
        return randomInt;
    }


    //Signature of a function
   // public boolean isPrime(int passedParams)

    public double absoluteValue(double x){
        if(x<0){
            return  -x;
        }else{
            return  x;
        }
    }


    public double calculateTip(double mealCost){

        double tip = (mealCost *15) /100;
        return tip;
    }

    public String nameTagText(String name){
        return  "Hello, my name is "+ name;
    }

    public double fahrenheitToCelsius(double temperatureF){
        double temperatureC = ((temperatureF - 32)*5)/9;
        return  temperatureC;
    }

    public void printTemperature(double temperatureF){
        double temperatureCelcuis =  fahrenheitToCelsius(temperatureF);
        System.out.println("F: "+ temperatureF + " and the equivalent value on Celcuis is "+ temperatureCelcuis);
    }

    //loop
    public boolean checkAlarm(){
        return false;
    }
    public String beep(){
        return "Wake up! It's 6 am";
    }
    public void alarm(){
        boolean on = checkAlarm();
        while(on){
            String ringing = beep();
            System.out.println(ringing);
            on = checkAlarm();
        }
        System.out.println("alarm stoped");
    }
    public String stringLength(){
        String caractere = "1";
        int lengthCaractere = caractere.length();
        while (lengthCaractere<101){
            caractere = caractere + "0";
            lengthCaractere = caractere.length();
            //System.out.println("entered while loop ");
        }
        return caractere;
    }
    public int keeprolling(){
        int dice1 = rollDice();
        int dice2 = rollDice();
        int dice3 = rollDice();
        int dice4 = rollDice();
        int dice5 = rollDice();
        int count = 1;
        while(!(dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5)){
            dice1 = rollDice();
            dice2 = rollDice();
            dice3 = rollDice();
            dice4 = rollDice();
            dice5 = rollDice();
            count = count +1;
        }
        return count;
    }

    public void raiseAlarm(int numberOfWrning){
        int i = 1;
        while (i<=numberOfWrning){
            System.out.println("Warning!");
            i++;
        }
    }

    public void raiseAlarmFor(int numberOfWrning){

        for(int i=1; i<numberOfWrning; i++){
            System.out.println("Warning!");
        }

    }

    public int countBlocks(int levels){
        int blocks = 0;

        for(int i=1;i<=levels;i++ ){
           blocks = blocks+i*i;
        }

        return blocks;
    }
    public String chooseRandom(){
        String[] namesList ={"mohtadi","nasri", "Hamma", "Nisma"};
        double randomNum = Math.random();
        randomNum = randomNum*4;
        int randomNameIndex = (int) randomNum;

        String luckyName = namesList[randomNameIndex];
        return luckyName;
    }

    //String [] names = {"mohtadiNasri", "mommmmmmmm", "nasriiiiiiiiiiiiiiiiiiiiiiiii", "alhamdulillah", "jawn7laJaw"};
    public String findLongestName(String [] names){
        int namesLength = names.length;
        //System.out.println(namesLength);
        String nametoCompareWith = names[0];
        //String result = "";
        for(int i=1; i<namesLength; i++){
           // System.out.println("index value "+names[i]);
           if(names[i].length() > nametoCompareWith.length()) {
               //System.out.println(nametoCompareWith.length());
               nametoCompareWith = names[i] + " is the longest";
               //System.out.println(result);
           }

        }

        return nametoCompareWith;
    }

    public int factorial(int n) {
        int factoriel = 1;
        for(int i=1; i<=n; i++) {
            factoriel = factoriel * i;
        }
         return  factoriel;
    }
    public int indexOfFirstOccurrence(String[] stringArray, String target)
    {
        for(int i=0; i<stringArray.length; i++){
            if(stringArray[i].equals(target)){
                return i;
            }
        }
        return -1;
    }

    public int yearsTilOneMillion(double initialBalance) {
        double balance = initialBalance;
        int yearsNumber = 0;
        while (balance<1000000){
            yearsNumber++;
            balance = balance * 1.05;

        }
        return yearsNumber;
    }

    public void printInReverse(String[] stringArray) {
        for (int i = stringArray.length - 1; i >= 0; i--) {
            System.out.println(stringArray[i]);
        }
    }





}
