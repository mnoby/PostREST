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
    private @Id String game_code;
    private String game_name;
    private String pub;
    private String cate;
    private String plat;

    Games() {}

    public Games(String game_code, String game_name, String pub, String cate, String plat) {
        this.game_code = game_code;
        this.game_name = game_name;
        this.pub = pub;
        this.cate = cate;
        this.plat = plat;
    }


    @Size(max = 20)
    @Pattern(regexp = "^[a-zA-Z0-9]*$")
    public String getGame_code() {
        return game_code;
    }

    public void setGame_code(String game_code) {
        this.game_code = game_code;
    }

    @Size(max = 50)
    public String getGame_name() {
        return game_name;
    }

    public void setGame_name(String game_name) {
        this.game_name = game_name;
    }

    @Size(max = 50)
    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }

    @Size(max = 50)
    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }

    @Size(max = 20)
    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Games))
            return false;
        Games games = (Games) o;
        return Objects.equals(this.game_code, games.game_code)
                && Objects.equals(this.game_name, games.game_name) && Objects.equals(this.pub, games.pub)
                && Objects.equals(this.cate, games.cate) && Objects.equals(this.plat, games.plat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.game_code, this.game_name, this.pub, this.cate, this.plat);
    }

    @Override
    public String toString() {
        return "Games{" +
                "game_code='" + game_code + '\'' +
                ", game_name='" + game_name + '\'' +
                ", pub='" + pub + '\'' +
                ", cate='" + cate + '\'' +
                ", plat=" + plat +
                '}';
    }
}