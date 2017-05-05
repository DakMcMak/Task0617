public class Main {
    public static void main(String[] args) {
        printIdea(new Idea());
    }
    public static class Idea {
        public String getDescription(){
            return "Каефффф у меня новый монитор";
        }
    }

    public static void printIdea(Idea idea)
    {
        System.out.println(idea.getDescription());
    }
}
