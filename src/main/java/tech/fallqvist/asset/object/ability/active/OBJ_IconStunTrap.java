package tech.fallqvist.asset.object.ability.active;

import tech.fallqvist.GamePanel;
import tech.fallqvist.util.UtilityTool;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;
import tech.fallqvist.asset.object.Object;

public class OBJ_IconStunTrap extends Object {

	private final GamePanel gamePanel;

	public OBJ_IconStunTrap(GamePanel gamePanel) {
		super(gamePanel);
		this.gamePanel = gamePanel;

		setName("Stun Trap Is Active");
		setValue(1);
		setDescription("[" + getName() + "]\nWill display active ability.");

		try {
			BufferedImage image = ImageIO.read(
					Objects.requireNonNull(getClass().getResourceAsStream("/images/ability/traps/stun_trap_icon.png")));
			setImage1(UtilityTool.scaleImage(image, gamePanel.getTileSize(), gamePanel.getTileSize()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void use() {
		gamePanel.playSoundEffect(1);
		gamePanel.getUi().addMessage("Ability = " + getName());
		
//		Needs changing to set ability
//		gamePanel.getPlayer().setCurrentMana(gamePanel.getPlayer().getCurrentMana() + getValue());
	}
}