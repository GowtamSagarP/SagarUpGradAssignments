package com.upgrad.ImageHoster.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Comment")
public class Comment implements Serializable {

    // These annotations auto-increments the commentId column for us whenever
    // a new Comment Object is stored into the database
    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commentId;

    @ManyToOne
    @JoinColumn(name="id", nullable=false)
    private Image image;

    public Comment() { }

    public Comment(Image image) {
        this.image = image;
    }

    public int getCommentId() { return this.commentId; }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
