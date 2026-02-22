
//Course — курстың атауы, сипаттамасы, кредит саны мен алдын ала шарттарын
//  сақтайтын мәлімет қорабы, қажет болса барлық ақпаратты жол түрінде шығара алады.

package practice3;

import java.util.ArrayList;

public class Course {
    private String name;
    private String description;
    private int creditNum;
    private ArrayList<String> prereqs;

    public Course(String name, String description, int creditNum, ArrayList<String> prereqs) {
        this.name = name;
        this.description = description;
        this.creditNum = creditNum;
        this.prereqs = prereqs;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course name: ").append(name);
        sb.append(", Description: ").append(description);
        sb.append(", Credits: ").append(creditNum);
        sb.append(", Prerequisites: ");
        for (int i = 0; i < prereqs.size(); i++) {
            sb.append(prereqs.get(i));
            if (i < prereqs.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }
}
