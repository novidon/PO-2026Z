package zadanie09;

public final class Settings {

    private final int volume;

    public Settings(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}

// class CustomSettings extends Settings { } // błąd kompilacji
