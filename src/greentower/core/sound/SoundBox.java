package greentower.core.sound;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * This class is a tool to ease use of sound
 * @author Guillaume
 *
 */
public class SoundBox
{
	/**
	 * 
	 */
	private File[] soundArray;
	
	/**
	 * 
	 */
	public static int SOUND_SKYRIM = 0;
	public static int SOUND_PLAY = 1;
	
	/**
	 * 
	 */
	private Clip clipForLoop;
	
	/**
	 * 
	 */
	private Clip clipForOnce;
	
	/**
	 * 
	 */
	public SoundBox()
	{
		try
		{
			this.clipForLoop = AudioSystem.getClip();
			this.clipForOnce = AudioSystem.getClip();
			this.soundArray = new File[]{ new File("sound/Skyrim_OST.wav"), new File("sound/button/switch_clic.wav")};
		} 
		catch (LineUnavailableException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	/**
	 * @param soundNumber 
	 * 
	 */
	public void playSoundOnce(int soundNumber)
	{
		try
		{
			this.clipForOnce.open(AudioSystem.getAudioInputStream(soundArray[soundNumber]));
			this.clipForOnce.loop(0);
		} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * @param soundNumber
	 */
	public void playSoundLoop(int soundNumber)
	{
		try
		{
			this.clipForLoop.open(AudioSystem.getAudioInputStream(soundArray[soundNumber]));
			this.clipForLoop.loop(Clip.LOOP_CONTINUOUSLY);
		} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e)
		{
			e.printStackTrace();
		}
	}
	
	public void stopSound(int soundNumber)
	{
		this.clipForLoop.close();
		this.clipForOnce.close();
	}
}
