package ru.rvsoft;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "version-info")
public class VersionInfoMojo extends AbstractMojo {
    @Override
    public void execute() throws MojoFailureException {
        getLog().info("version-info plugin:" +
                " Здесь должно происходить чтение версии из readme.md и изменение файла версии");
        // DO SOMETHING
    }
}
