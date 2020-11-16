package masterIL.example.RestSpringBoot.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class Serie {

    private String name;
    private String author;
    private String resume;


    public Serie(){

    }

    public Serie(String name, String author, String resume){
        this.name = name;
        this.author = author;
        this.resume = resume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }
}
