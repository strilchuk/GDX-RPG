package com.rpsg.rpg.system.ui;

import com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle;
import com.rpsg.rpg.core.Setting;
import com.rpsg.rpg.system.base.Res;
import com.rpsg.rpg.system.ui.ImageButton.ImageButtonStyle;

public class UI {
	public static ImageButton imageButton(){
		ImageButtonStyle style = new ImageButtonStyle();
		style.up = Res.getDrawable(Setting.UI_GRAY_IMG);
		style.down = Setting.UI_BUTTON;
		
		return new ImageButton(style);
	}
	
	public static CheckBox checkbox(){
		CheckBoxStyle style = new CheckBoxStyle();
		style.up = Res.getDrawable(Setting.UI_GRAY_IMG);
		style.checkboxOn = Setting.UI_BUTTON;
		style.font = Res.font.get(22);
		return new CheckBox(style);
	}
	
	public static CheckBox checkbox(String fg){
		return checkbox().foreground(Res.get(fg));
	}
}