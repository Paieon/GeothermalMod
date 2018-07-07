package ca.zeor.geothermal;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class TileEntityKineticGenerator extends TileEntity implements ITickable{

	private int power = 100;
	private int ppt = 20;
	private int maxPower = 1000;

	@Override
	public void update() {
		if (power < maxPower-20) {
			power = power + 20;
		}
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		compound.setInteger("power", power);
		return super.writeToNBT(compound);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		power = compound.getInteger("power");
		super.readFromNBT(compound);
	}
	
	public int getPower() {
		return power;
	}

}