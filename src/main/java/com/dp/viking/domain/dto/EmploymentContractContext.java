package com.dp.viking.domain.dto;

import java.util.Date;

public class EmploymentContractContext {
    private String firstName;
    private String departmentName;
    private Date dateIn;
    private String secondName;
    private String title;
    private String categoryName;
    private static final String TEMPLATE_DOC_PATH = "C:/Study/DP/Doc_templates/";
    private static final String READY_DOC_PATH = "C:/Study/DP/Ready_doc/Приказы_о_найме/";

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public static String getTemplateDocPathDocPath() {
        return TEMPLATE_DOC_PATH;
    }

    public static String getReadyDocPath() {
        return READY_DOC_PATH;
    }
}
