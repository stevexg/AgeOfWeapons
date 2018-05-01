package magmasrc.ageofweapons.worldgen;

import java.util.Random;

import com.google.common.base.Predicate;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenOre implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {
		
		case 1:
			GenerateEnd(world, random, chunkX *16, chunkZ * 16);
			break;
			
		case 0:
			GenerateOverworld(world, random, chunkX *16, chunkZ * 16);
			break;
			
		case -1:
			GenerateNether(world, random, chunkX *16, chunkZ * 16);
			break;	
		}
		
	}


	 private void addOre(IBlockState block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chance, int minY, int maxY, Predicate<IBlockState> blockToSpawnIn){
		  int diffMinMaxY = maxY - minY;
		  for(int x = 0; x < chance; x++){
		   int posX = blockXPos + random.nextInt(maxX);
		   int posY = minY + random.nextInt(diffMinMaxY);
		   int posZ = blockZPos + random.nextInt(maxZ);
		   (new WorldGenMinable(block, maxVeinSize, blockToSpawnIn)).generate(world, random, new BlockPos(posX, posY, posZ));
		   //System.out.println("Ore generated: " + posX + " " + posY + " " + posZ + " " + block);
		   }
	 }                                                    
		
	
	 private void addNetherOre(IBlockState block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chance, int minY, int maxY, Predicate<IBlockState> blockToSpawnIn){
		  int diffMinMaxY = maxY - minY;
		  for(int x = 0; x < chance; x++){
		   int posX = blockXPos + random.nextInt(maxX);
		   int posY = minY + random.nextInt(diffMinMaxY);
		   int posZ = blockZPos + random.nextInt(maxZ);
		   (new WorldGenMinable(block, maxVeinSize, blockToSpawnIn)).generate(world, random, new BlockPos(posX, posY, posZ));
		  }
	 }   
                                                   
	 
	 private void addEndOre(IBlockState block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chance, int minY, int maxY, Predicate<IBlockState> blockToSpawnIn){
		  int diffMinMaxY = maxY - minY;
		  for(int x = 0; x < chance; x++){
		   int posX = blockXPos + random.nextInt(maxX);
		   int posY = minY + random.nextInt(diffMinMaxY);
		   int posZ = blockZPos + random.nextInt(maxZ);
		   (new WorldGenMinable(block, maxVeinSize, blockToSpawnIn)).generate(world, random, new BlockPos(posX, posY, posZ));
		  }
	 }   
	
	
	 
	 
	 
	 

	

	private void GenerateOverworld(World world, Random random, int chunkX, int chunkZ) {
		if (AgeOfWeapons.activateWorldGeneration) {					        			     //MaxVeinSize | rarity | MinY | MaxY | Terrain
			addOre(ModBlocks.amberOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,   /**/ 3, 1, 1, 16, BlockMatcher.forBlock(Blocks.STONE));
			addOre(ModBlocks.amethystOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 3, 1, 1, 16, BlockMatcher.forBlock(Blocks.STONE));
			addOre(ModBlocks.rubyOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,    /**/ 3, 1, 1, 16, BlockMatcher.forBlock(Blocks.STONE));
			addOre(ModBlocks.sapphireOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,/**/ 1, 1, 1, 16, BlockMatcher.forBlock(Blocks.STONE));
			addOre(ModBlocks.topazOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,   /**/ 3, 1, 1, 16, BlockMatcher.forBlock(Blocks.STONE));
		}	
	}
	
	
	private void GenerateNether(World world, Random random, int chunkX, int chunkZ) {
		if (AgeOfWeapons.activateWorldGeneration) { }	
	}


	private void GenerateEnd(World world, Random random, int chunkX, int chunkZ) { 
		if (AgeOfWeapons.activateWorldGeneration) {	}
	}

}
