package application.dto;

import javax.persistence.*;

@Entity
@Table(name="colors")
public class Color {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="color_id")
	private int colorId;
	
	@Column(name="color_name")
	private String colorName;

	public Color(int colorId, String colorName) {
		super();
		this.colorId = colorId;
		this.colorName = colorName;
	}

	public Color() {
		super();
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public int getColorId() {
		return colorId;
	}

	@Override
	public String toString() {
		return "Color [colorId=" + colorId + ", colorName=" + colorName + "]";
	}
	
	
}
