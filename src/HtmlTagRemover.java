
public class HtmlTagRemover {

    public static void main(String[] args) {

        String input = "<div class=\"navigation\">navigation menu</div>";
        String stripped = input.replaceAll("<[^>]*>", "");

        System.out.println(stripped);
    }
}
