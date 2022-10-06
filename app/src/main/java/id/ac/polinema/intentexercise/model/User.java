package id.ac.polinema.intentexercise.model;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
    private String fullname,nim,pass,confirm,home,about;

    public User(String fullname, String nim, String pass, String confirm, String home, String about) {
        this.fullname = fullname;
        this.nim = nim;
        this.pass = pass;
        this.confirm = confirm;
        this.home = home;
        this.about = about;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getConpass() {
        return confirm;
    }

    public void setConpass(String conpass) {
        this.confirm = confirm;
    }

    public String getHomep() {
        return home;
    }

    public void setHomep(String homep) {
        this.home = home;
    }

    public String getAboutu() {
        return about;
    }

    public void setAboutu(String aboutu) {
        this.about = about;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.fullname);
        dest.writeString(this.nim);
        dest.writeString(this.pass);
        dest.writeString(this.confirm);
        dest.writeString(this.home);
        dest.writeString(this.about);
    }

    public void readFromParcel(Parcel source) {
        this.fullname = source.readString();
        this.nim = source.readString();
        this.pass = source.readString();
        this.confirm = source.readString();
        this.home = source.readString();
        this.about = source.readString();
    }

    protected User(Parcel in) {
        this.fullname = in.readString();
        this.nim = in.readString();
        this.pass = in.readString();
        this.confirm = in.readString();
        this.home = in.readString();
        this.about = in.readString();
    }

    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
// https://github.com/dhinahh/