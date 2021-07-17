import org.json.JSONObject;

public class test {
    public static void main(String[] args) {
        String text  = "{\"shubh\":12";
        if(text.startsWith("{") && text.endsWith("}")) {
            JSONObject data = new JSONObject(text);
            System.out.println(data);
        }
        else System.out.println(text);
    }
}
