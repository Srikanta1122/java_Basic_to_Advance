public class First {
    public static void main(String[] args) {
       
        StringBuilder str=new StringBuilder("Srikanta");
        System.out.println(str);

        // char at index 0
       
        System.out.println(str.charAt(0));

        // set/replace at index 0

        str.setCharAt(0,'p');
        System.out.println(str);

        // insert a string

        str.insert(0,'S');
        System.out.println(str);
        str.insert(7,'t');
        System.out.println(str);
       
        // string delete

        str.delete(7,8);
        System.out.println(str);
        str.delete(1,2);
        System.out.println(str);

    }
}  