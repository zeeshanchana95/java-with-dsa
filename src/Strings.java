
public class Strings {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Zeeshan");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index
        sb.setCharAt(0, 'A');
        System.out.println(sb);

        //insert character at specific index and shift other characters
        sb.insert(1, "hmed Z");
        System.out.println(sb);

        //delete specific part from string
        sb.delete(0, 6);
        System.out.println(sb);

        //append other string
        sb.append(" ");
        sb.append("A");
        sb.append("h");
        sb.append("med");
        System.out.println(sb);

        //length
        System.out.println(sb.length());



    }
}