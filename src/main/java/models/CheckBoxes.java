package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;


@Setter
@Getter
@Builder
@ToString

public class CheckBoxes {

    boolean home;
        boolean desktop;
            boolean notes;
            boolean commands;
        boolean documents;
            boolean workspace;
                boolean react;
                boolean angular;
                boolean veu;
            boolean office;
                boolean publiC;
                boolean privatE;
                boolean classified;
                boolean general;
        boolean downloads;
            boolean wordFile;
            boolean excelFile;

    public HashMap<String, Boolean> getMap(){
        HashMap<String, Boolean> m = new HashMap<>();
        m.put("Home", home);
        m.put("Desktop", desktop);
        m.put("Notes", notes);
        m.put("Commands", commands);
        m.put("Documents", documents);
        m.put("WorkSpace", workspace);
        m.put("React", react);
        m.put("Angular", angular);
        m.put("Veu", veu);
        m.put("Office", office);
        m.put("Public", publiC);
        m.put("Private", privatE);
        m.put("Classified", classified);
        m.put("General", general);
        m.put("Downloads", downloads);
        m.put("Word File.doc", wordFile);
        m.put("Excel File.doc", excelFile);
        return m;
    }

    public LinkedHashMap<String, Boolean> getMapRes(){
        LinkedHashMap<String, Boolean> m = new LinkedHashMap<>();
        if(home){
            m.put("Home", true);
            m.put("Desktop", true);
            m.put("Notes", true);
            m.put("Commands", true);
            m.put("Documents", true);
            m.put("WorkSpace", true);
            m.put("React", true);
            m.put("Angular", true);
            m.put("Veu", true);
            m.put("Office", true);
            m.put("Public", true);
            m.put("Private", true);
            m.put("Classified", true);
            m.put("General", true);
            m.put("Downloads", true);
            m.put("Word File.doc", true);
            m.put("Excel File.doc", true);
            return m;
        }
        if(desktop){
            m.put("Desktop", true);
            m.put("Notes", true);
            m.put("Commands", true);
        }
        if(documents){
            m.put("Documents", true);
            m.put("WorkSpace", true);
            m.put("React", true);
            m.put("Angular", true);
            m.put("Veu", true);
            m.put("Office", true);
            m.put("Public", true);
            m.put("Private", true);
            m.put("Classified", true);
            m.put("General", true);
        }
        if(workspace){
            m.put("WorkSpace", true);
            m.put("React", true);
            m.put("Angular", true);
            m.put("Veu", true);
        }
        if(office){
            m.put("Office", true);
            m.put("Public", true);
            m.put("Private", true);
            m.put("Classified", true);
            m.put("General", true);
        }
        if(downloads){
            m.put("Downloads", true);
            m.put("Word File.doc", true);
            m.put("Excel File.doc", true);
        }
        m.putIfAbsent("Home", home);
        m.putIfAbsent("Desktop", desktop);
        m.putIfAbsent("Notes", notes);
        m.putIfAbsent("Commands", commands);
        m.putIfAbsent("Documents", documents);
        m.putIfAbsent("WorkSpace", workspace);
        m.putIfAbsent("React", react);
        m.putIfAbsent("Angular", angular);
        m.putIfAbsent("Veu", veu);
        m.putIfAbsent("Office", office);
        m.putIfAbsent("Public", publiC);
        m.putIfAbsent("Private", privatE);
        m.putIfAbsent("Classified", classified);
        m.putIfAbsent("General", general);
        m.putIfAbsent("Downloads", downloads);
        m.putIfAbsent("Word File.doc", wordFile);
        m.putIfAbsent("Excel File.doc", excelFile);
        return m;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckBoxes that = (CheckBoxes) o;
        return home == that.home && desktop == that.desktop && notes == that.notes && commands == that.commands && documents == that.documents && workspace == that.workspace && react == that.react && angular == that.angular && veu == that.veu && office == that.office && publiC == that.publiC && privatE == that.privatE && classified == that.classified && general == that.general && downloads == that.downloads && wordFile == that.wordFile && excelFile == that.excelFile;
    }

    @Override
    public int hashCode() {
        return Objects.hash(home, desktop, notes, commands, documents, workspace, react, angular, veu, office, publiC, privatE, classified, general, downloads, wordFile, excelFile);
    }
}
