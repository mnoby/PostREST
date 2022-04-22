package games;

import java.util.Arrays;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
class Games {

//    private @GeneratedValue Long id;
    private @Id String gameCode;
    private String gameName;
    private String publisher;
    private String category;
    private String platform;

    Games() {}

    public Games(String gameCode, String gameName, String publisher, String category, String platform) {
        this.gameCode = gameCode;
        this.gameName = gameName;
        this.publisher = publisher;
        this.category = category;
        this.platform = platform;
    }

    @Size(max = 20)
    @Pattern(regexp = "^[a-zA-Z0-9]*$")
    public String getGameCode() {
        return gameCode;
    }
    public void setGameCode(String gameCode) {
        this.gameCode = gameCode;
    }

    @Size(max = 50)
    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    @Size(max = 50)
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Size(max = 50)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Size(max = 20)
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Games)) return false;
        Games games = (Games) o;
        return Objects.equals(this.gameCode, games.gameCode)
                && Objects.equals(this.gameName, games.gameName) && Objects.equals(this.publisher, games.publisher)
                && Objects.equals(this.category, games.category) && Objects.equals(this.platform, games.platform);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.gameCode, this.gameName, this.publisher, this.category, this.platform);
    }

    @Override
    public String toString() {
        return "Games{" +
                "gameCode='" + gameCode + '\'' +
                ", gameName='" + gameName + '\'' +
                ", publisher='" + publisher + '\'' +
                ", category='" + category + '\'' +
                ", platform='" + platform + '\'' +
                '}';
    }
}