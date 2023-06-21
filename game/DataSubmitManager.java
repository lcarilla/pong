public class DataSubmitManager {
    public DataSubmitManager() {
        URL url = new URL("http://example.com");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
    }
}
