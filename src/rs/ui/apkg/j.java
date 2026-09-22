package rs.ui.apkg;

import com.google.a.b.V;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;

/* JADX INFO: loaded from: client-final.jar:rs/ui/a/j.class */
public class j extends c {
    private Instant b;
    private Instant c;
    private Duration d;

    public j(long j, ChronoUnit chronoUnit, BufferedImage bufferedImage, String str, String str2) {
        super(bufferedImage, str, str2);
        V.a(j > 0, "negative period!");
        this.b = Instant.now();
        this.d = Duration.of(j, chronoUnit);
        this.c = this.b.plus((TemporalAmount) this.d);
    }

    @Override // rs.ui.a.c
    public String a() {
        Duration durationBetween = Duration.between(Instant.now(), this.c);
        return r() ? d(durationBetween) : c(durationBetween);
    }

    @Override // rs.ui.a.c
    public Color b() {
        return ((double) Duration.between(Instant.now(), this.c).getSeconds()) < ((double) this.d.getSeconds()) * 0.1d ? Color.RED.brighter() : Color.WHITE;
    }

    @Override // rs.ui.a.c
    public boolean e() {
        return !Duration.between(Instant.now(), this.c).isNegative();
    }

    @Override // rs.ui.a.c
    public boolean f() {
        Duration durationBetween = Duration.between(Instant.now(), this.c);
        return durationBetween.isZero() || durationBetween.isNegative();
    }

    private String c(Duration duration) {
        if (duration.toHours() >= 1) {
            long seconds = duration.getSeconds();
            return String.format("%dh%02dm", Long.valueOf(seconds / 3600), Long.valueOf((seconds % 3600) / 60), Long.valueOf(seconds % 60));
        }
        int millis = (int) (duration.toMillis() / 1000);
        return String.format("%d:%02d", Integer.valueOf((millis % 3600) / 60), Integer.valueOf(millis % 60));
    }

    private String d(Duration duration) {
        if (duration.toHours() < 1) {
            return duration.toMinutes() >= 1 ? String.format("%dm", Integer.valueOf((((int) (duration.toMillis() / 1000)) % 3600) / 60)) : String.format("%d", Long.valueOf(duration.getSeconds()));
        }
        long seconds = duration.getSeconds();
        return String.format("%dh", Long.valueOf(seconds / 3600), Long.valueOf((seconds % 3600) / 60), Long.valueOf(seconds % 60));
    }

    public void a(Duration duration) {
        V.a(!duration.isNegative(), "negative duration");
        this.d = duration;
        this.c = this.b.plus((TemporalAmount) duration);
    }

    public void b(Duration duration) {
        V.a(!duration.isNegative(), "negative duration");
        this.b = Instant.now();
        this.c = Instant.now().plus((TemporalAmount) duration);
        this.d = Duration.between(this.b, this.c);
    }

    public Instant c() {
        return this.b;
    }

    public Instant d() {
        return this.c;
    }

    public Duration s() {
        return this.d;
    }

    public String toString() {
        return "TimerInfoBox(startTime=" + String.valueOf(c()) + ", endTime=" + String.valueOf(d()) + ", duration=" + String.valueOf(s()) + ")";
    }
}
