package boot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="relation_properties")
public class RelationProperties implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "is_transitive")
	private int isTransitive;
	
	@Column(name = "is_symmetric")
	private int isSymmetric;
	
	@Column(name = "is_anti_symmetric")
	private int isAntiSymmetric;
	
	@Column(name = "is_cyclic")
	private int isCyclic;
	
	@Column(name = "is_reflexive")
	private int isReflexive;
	
	@Column(name = "is_metadata_tag")
	private int isMetadataTag;

	

	public RelationProperties(int isTransitive, int isSymmetric, int isAntiSymmetric, int isCyclic, int isReflexive,
			int isMetadataTag) {
		super();
		this.isTransitive = isTransitive;
		this.isSymmetric = isSymmetric;
		this.isAntiSymmetric = isAntiSymmetric;
		this.isCyclic = isCyclic;
		this.isReflexive = isReflexive;
		this.isMetadataTag = isMetadataTag;
	}

	public RelationProperties() {
		this(0, 0, 0, 0, 0, 0);
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIsTransitive() {
		return isTransitive;
	}

	public void setIsTransitive(int isTransitive) {
		this.isTransitive = isTransitive;
	}

	public int getIsSymmetric() {
		return isSymmetric;
	}

	public void setIsSymmetric(int isSymmetric) {
		this.isSymmetric = isSymmetric;
	}

	public int getIsAntiSymmetric() {
		return isAntiSymmetric;
	}

	public void setIsAntiSymmetric(int isAntiSymmetric) {
		this.isAntiSymmetric = isAntiSymmetric;
	}

	public int getIsCyclic() {
		return isCyclic;
	}

	public void setIsCyclic(int isCyclic) {
		this.isCyclic = isCyclic;
	}

	public int getIsReflexive() {
		return isReflexive;
	}

	public void setIsReflexive(int isReflexive) {
		this.isReflexive = isReflexive;
	}

	public int getIsMetadataTag() {
		return isMetadataTag;
	}

	public void setIsMetadataTag(int isMetadataTag) {
		this.isMetadataTag = isMetadataTag;
	}

	@Override
	public String toString() {
		return "RelationProperties [id=" + id + ", isTransitive=" + isTransitive + ", isSymmetric=" + isSymmetric
				+ ", isAntiSymmetric=" + isAntiSymmetric + ", isCyclic=" + isCyclic + ", isReflexive=" + isReflexive
				+ ", isMetadataTag=" + isMetadataTag + "]";
	}

	
}
