public class strbldr{
    public static void main(String[] args){
        String s = "hello";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
        sb.append("world");
        System.out.println(sb);
        System.out.println(sb.charAt(3));
        System.out.println(sb.length());
        sb.deleteCharAt(4);
        System.out.println(sb);
        sb.delete(0,3);
        System.out.println(sb);

    }
}