
package org.anna.testJsonSchema.models.v1;

import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * document
 * <p>
 * A song
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "artist",
    "title",
    "genre"
})
public class Song {

    /**
     * Server generated id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Server generated id")
    private String id;
    /**
     * The song artist
     * (Required)
     * 
     */
    @JsonProperty("artist")
    @JsonPropertyDescription("The song artist")
    @NotNull
    private String artist;
    /**
     * The song title
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The song title")
    @NotNull
    private String title;
    /**
     * The song genre
     * 
     */
    @JsonProperty("genre")
    @JsonPropertyDescription("The song genre")
    private String genre;

    /**
     * Server generated id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Server generated id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Song withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The song artist
     * (Required)
     * 
     */
    @JsonProperty("artist")
    public String getArtist() {
        return artist;
    }

    /**
     * The song artist
     * (Required)
     * 
     */
    @JsonProperty("artist")
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Song withArtist(String artist) {
        this.artist = artist;
        return this;
    }

    /**
     * The song title
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * The song title
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Song withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * The song genre
     * 
     */
    @JsonProperty("genre")
    public String getGenre() {
        return genre;
    }

    /**
     * The song genre
     * 
     */
    @JsonProperty("genre")
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Song withGenre(String genre) {
        this.genre = genre;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(artist).append(title).append(genre).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Song) == false) {
            return false;
        }
        Song rhs = ((Song) other);
        return new EqualsBuilder().append(id, rhs.id).append(artist, rhs.artist).append(title, rhs.title).append(genre, rhs.genre).isEquals();
    }

}
