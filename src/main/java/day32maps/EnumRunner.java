package day32maps;
    /*
     //Enum icine birden fazla data koyabiliriz
     //Enum icindeki datalara getter lar sayesinde ulasilabilir
   */

public class EnumRunner {

    public static void main(String[] args) {

        String capital=UsStates.CALIFORNIA.getCapital();
        System.out.println(capital);//Sacramento

        String abbr=UsStates.FLORIDA.getAbbreviation();
        System.out.println(abbr);//FL

        String state=UsStates.getStateNameFromAbbreviation("FL");
        System.out.println(state);

        String stateName = UsStates.getStateNameFromCapital("Denver");
        System.out.println(stateName);

        String abbreviation=UsStates.getAbbreviationFromCapital("Atlanta");
        System.out.println(abbreviation);
    }


}
