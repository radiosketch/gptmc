package net.rad1osketxh.gptmc.client;

import net.minecraft.client.gui.screen.TitleScreen;
import net.rad1osketxh.gptmc.GPTMC;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class gptmcClient {
    @Inject(at = @At("HEAD"), method="init()V")
    private void init(CallbackInfo info) { GPTMC.LOGGER.info("Thank you for checking out GPT-MC!"); }
}
