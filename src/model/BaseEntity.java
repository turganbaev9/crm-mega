package model;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public abstract class BaseEntity {
    private  String format;



    protected long id;
   protected LocalDateTime dateCreated=LocalDateTime.now();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
    protected SimpleDateFormat simpleDateFormat;

    SimpleDateFormat sdf =new SimpleDateFormat("EEEE dd- MM- yyyy");

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    public SimpleDateFormat getSimpleDateFormat() {
        return simpleDateFormat;
    }


    public void setSimpleDateFormat(SimpleDateFormat simpleDateFormat) {
        this.simpleDateFormat = simpleDateFormat;
    }
}