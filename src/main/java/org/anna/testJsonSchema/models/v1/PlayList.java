
package org.anna.testJsonSchema.models.v1;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * playList
 * <p>
 * A list of songs
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "songs"
})
public class PlayList {

    /**
     * Server generated identifier for this playlist
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Server generated identifier for this playlist")
    private String id;
    /**
     * The name of the playlist
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the playlist")
    @NotNull
    private String name;
    /**
     * Songs in the playlist
     * (Required)
     * 
     */
    @JsonProperty("songs")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Songs in the playlist")
    @Size(min = 1, max = 100)
    @Valid
    @NotNull
    private Set<Song> songs = new LinkedHashSet<Song>();

    /**
     * Server generated identifier for this playlist
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Server generated identifier for this playlist
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PlayList withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The name of the playlist
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of the playlist
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public PlayList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Songs in the playlist
     * (Required)
     * 
     */
    @JsonProperty("songs")
    public Set<Song> getSongs() {
        return songs;
    }

    /**
     * Songs in the playlist
     * (Required)
     * 
     */
    @JsonProperty("songs")
    public void setSongs(Set<Song> songs) {
        this.songs = songs;
    }

    public PlayList withSongs(Set<Song> songs) {
        this.songs = songs;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(name).append(songs).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PlayList) == false) {
            return false;
        }
        PlayList rhs = ((PlayList) other);
        return new EqualsBuilder().append(id, rhs.id).append(name, rhs.name).append(songs, rhs.songs).isEquals();
    }

}
