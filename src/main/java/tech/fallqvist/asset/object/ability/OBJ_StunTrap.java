package tech.fallqvist.asset.object.ability;

import tech.fallqvist.GamePanel;
import tech.fallqvist.asset.entity.Entity;
import tech.fallqvist.asset.entity.ability.Trap;

public class OBJ_StunTrap extends Trap {

	public OBJ_StunTrap(GamePanel gamePanel) {
		super(gamePanel);

		setName("Stun Trap");
//		setSpeed(6);
		setMaxLife(80);
		setCurrentLife(getMaxLife());
//		setAttackPower(0);
		setUseCost(1);
		setAlive(false);
	}
	
	public void getAnimationImages() {
		setTrapNoDirection(setup("/images/ability/traps/stun_trap_icon", getGamePanel().getTileSize(), getGamePanel().getTileSize()));
	}

	@Override
	public boolean haveEnoughResource(Entity user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void subtractResource(Entity user) {
		// TODO Auto-generated method stub
		
	}
}
