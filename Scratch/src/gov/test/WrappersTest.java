package gov.test;

class WrappersTest {

    public static void main(String[] args) {
        String ageInput = "26";
        int age = Integer.parseInt(ageInput);
        Integer ageInteger = Integer.valueOf(ageInput);

        String brainCellsInput = "86000000000";
        long brainCells = Long.parseLong(brainCellsInput);
        Long brainCellsLong = Long.valueOf(brainCellsInput);

        String shoeSizeInput = "9.5";
        double shoeSize = Double.parseDouble(shoeSizeInput);
        Double shoeSizeDouble = Double.valueOf(shoeSizeInput);

        String isSunnyInput = "true";
        boolean sunny = Boolean.parseBoolean(isSunnyInput);
        Boolean isSunnyBoolean = Boolean.valueOf(isSunnyInput);

        Integer size = 9;
    }

}
