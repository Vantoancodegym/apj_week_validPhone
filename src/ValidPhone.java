public class ValidPhone {
    public static void main(String[] args) {
        String regex="84-0[1-9]{9}";
        String phone1="84-0123456789";
        String phone2="44-9123456789";
        String phone3="84-0023456789";
        String phone4="84-0123456789";
        System.out.println(phone1.matches(regex));
        System.out.println(phone2.matches(regex));
        System.out.println(phone3.matches(regex));
        System.out.println(phone4.matches(regex));
    }
}
