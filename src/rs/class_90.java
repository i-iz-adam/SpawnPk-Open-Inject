package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_90.class */
public enum class_90 {
    a("Error in version check!\nCould not retrieve remote version file. Server is either offline or the remote file is corrupt.\n\nPlease try again in a few minutes."),
    b("There has been an issue downloading a game asset!\nPlease try again in a few minutes.\nIf the issue continues, post a ticket on our website!");

    private String c;

    class_90(String str) {
        this.c = str;
    }

    public String a() {
        return this.c;
    }
}
