package io.sparkled.renderer.context;

import io.sparkled.model.animation.effect.Effect;
import io.sparkled.model.render.RenderedChannel;
import io.sparkled.model.render.RenderedFrame;

public class RenderContext {
    private final RenderedChannel channel;
    private final RenderedFrame frame;
    private final Effect effect;
    private final float progress;

    public RenderContext(RenderedChannel channel, RenderedFrame frame, Effect effect, float progress) {
        this.channel = channel;
        this.frame = frame;
        this.effect = effect;
        this.progress = progress;
    }

    public RenderedChannel getChannel() {
        return channel;
    }

    public RenderedFrame getFrame() {
        return frame;
    }

    public Effect getEffect() {
        return effect;
    }

    public float getProgress() {
        return progress;
    }
}
