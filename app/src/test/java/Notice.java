public class Notice {

    String notice;
    String name;
    String date;

    public Notice(String name, String date, String notice) {
        this.name = name;
        this.date = date;
        this.notice = notice;
    }

    public String getNotice() {
        return notice;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }
}