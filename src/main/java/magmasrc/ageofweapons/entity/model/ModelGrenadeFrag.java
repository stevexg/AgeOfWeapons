package magmasrc.ageofweapons.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

//Cubik Studio 2.8.445 Beta JAVA exporter
//Designed by RexRaptor with Cubik Studio - https://cubik.studio

public class ModelGrenadeFrag extends ModelBase {

	   //fields
    ModelRenderer e1;

    public ModelGrenadeFrag() {
        textureWidth = 64;
        textureHeight = 64;

        e1 = new ModelRenderer(this, 0, 47);
        e1.addBox(0F, 0F, -8F, 16, 16, 1);
        e1.setRotationPoint(0F, 0F, 8F);
        e1.setTextureSize(64, 64);
        e1.mirror = false;
        setRotation(e1, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);

        e1.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
     
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
 
}