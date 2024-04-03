import com.theokanning.openai.utils.*;
import com.knuddels.jtokkit.api.ModelType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TikTokensUtilGetModelTypeByNameTest {
    
    @Test
    public void testValidGpt35Turbo0301ModelName() {
        String name = "GPT_3_5_TURBO_0301";
        ModelType result = TikTokensUtil.getModelTypeByName(name);
        assertEquals(ModelType.GPT_3_5_TURBO, result, "Model type should be GPT_3_5_TURBO for name GPT_3_5_TURBO_0301");
    }
    
    @Test
    public void testValidGpt4ModelName() {
        String name = "GPT_4";
        ModelType result = TikTokensUtil.getModelTypeByName(name);
        assertEquals(ModelType.GPT_4, result, "Model type should be GPT_4 for name GPT_4");
    }
    
    @Test
    public void testUnknownModelName() {
        String name = "UNKNOWN_MODEL";
        ModelType result = TikTokensUtil.getModelTypeByName(name);
        assertNull(result, "Model type should be null for unknown model name");
    }
    
    @Test
    public void testNullModelName() {
        String name = null;
        ModelType result = TikTokensUtil.getModelTypeByName(name);
        assertNull(result, "Model type should be null for null model name");
    }
}
