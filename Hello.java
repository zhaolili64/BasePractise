public class Hello {
    public static void main(String[] args) {
        System.out.println("这是一个简单的Java应用程序");
        Stuedent stu;
        stu = new Stuedent();
        stu.speak("We are stuedent");
    }
    static class  Stuedent {
        public void speak(String s) {
            System.out.println(s);
        }
    }
}
