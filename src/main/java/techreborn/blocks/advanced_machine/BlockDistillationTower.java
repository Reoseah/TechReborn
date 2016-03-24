package techreborn.blocks.advanced_machine;

import net.minecraft.block.material.Material;
import reborncore.common.blocks.BlockMachineBase;
import reborncore.common.blocks.IRotationTexture;
import techreborn.client.TechRebornCreativeTab;

public class BlockDistillationTower extends BlockMachineBase implements IRotationTexture
{

	public BlockDistillationTower(Material material)
	{
		super();
		setUnlocalizedName("techreborn.distillationtower");
		setCreativeTab(TechRebornCreativeTab.instance);
	}

	private final String prefix = "techreborn:blocks/machine/advanced_machines/";

	@Override
	public String getFrontOff()
	{
		return prefix + "distillation_tower_front_off";
	}

	@Override
	public String getFrontOn()
	{
		return prefix + "distillation_tower_front_off";
	}

	@Override
	public String getSide()
	{
		return prefix + "advanced_machine_side";
	}

	@Override
	public String getTop()
	{
		return prefix + "industrial_centrifuge_top_off";
	}

	@Override
	public String getBottom()
	{
		return prefix + "industrial_centrifuge_bottom";
	}
}
