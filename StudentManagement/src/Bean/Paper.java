/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author PCPAL
 */
public class Paper {

    private int paperNo;
    private String filePath;
    private String paperName;
    private String PaperDescription;
    private String PaperCreateDate;

    public int getPaperNo() {
        return paperNo;
    }

    public void setPaperNo(int paperNo) {
        this.paperNo = paperNo;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public String getPaperDescription() {
        return PaperDescription;
    }

    public void setPaperDescription(String PaperDescription) {
        this.PaperDescription = PaperDescription;
    }

    public String getPaperCreateDate() {
        return PaperCreateDate;
    }

    public void setPaperCreateDate(String PaperCreateDate) {
        this.PaperCreateDate = PaperCreateDate;
    }

}
