package greentower.core;

/**
 * @author viognef
 *
 */
public enum Tower
{
	/**
	 * Stage n°23
	 */
	STAGE23(new Choice(Dialog.DIALOG_STAGE23, Answers.ANSWERS_STAGE23), new Stage[] {}),

	/**
	 * Stage n°22
	 */
	STAGE22(new Choice(Dialog.DIALOG_STAGE22, Answers.ANSWERS_STAGE22), new Stage[] {Tower.STAGE23}), new Stage[] {}),

	/**
	 * Stage n°21
	 */
	STAGE21(new Choice(Dialog.DIALOG_STAGE21, Answers.ANSWERS_STAGE21), new Stage[] {}),

	/**
	 * Stage n°20
	 */
	STAGE20(new Choice(Dialog.DIALOG_STAGE20, Answers.ANSWERS_STAGE20), new Stage[] {}),

	/**
	 * Stage n°19
	 */
	STAGE19(new Choice(Dialog.DIALOG_STAGE19, Answers.ANSWERS_STAGE19), new Stage[] {}),

	/**
	 * Stage n°18
	 */
	STAGE18(new Choice(Dialog.DIALOG_STAGE18, Answers.ANSWERS_STAGE18), new Stage[] {}),

	/**
	 * Stage n°17
	 */
	STAGE17(new Choice(Dialog.DIALOG_STAGE17, Answers.ANSWERS_STAGE17), new Stage[] {}),

	/**
	 * Stage n°16
	 */
	STAGE16(new Choice(Dialog.DIALOG_STAGE16, Answers.ANSWERS_STAGE16), new Stage[] {}),

	/**
	 * Stage n°15
	 */
	STAGE15(new Choice(Dialog.DIALOG_STAGE15, Answers.ANSWERS_STAGE15), new Stage[] {}),

	/**
	 * Stage n°14
	 */
	STAGE14(new Choice(Dialog.DIALOG_STAGE14, Answers.ANSWERS_STAGE14), new Stage[] {}),

	/**
	 * Stage n°13
	 */
	STAGE13(new Choice(Dialog.DIALOG_STAGE13, Answers.ANSWERS_STAGE13), new Stage[] {}),

	/**
	 * Stage n°12
	 */
	STAGE12(new Choice(Dialog.DIALOG_STAGE12, Answers.ANSWERS_STAGE12), new Stage[] {}),

	/**
	 * Stage n°11
	 */
	STAGE11(new Choice(Dialog.DIALOG_STAGE11, Answers.ANSWERS_STAGE11), new Stage[] {}),

	/**
	 * Stage n°10
	 */
	STAGE10(new Choice(Dialog.DIALOG_STAGE10, Answers.ANSWERS_STAGE10), new Stage[] {}),

	/**
	 * Stage n°9
	 */
	STAGE9(new Choice(Dialog.DIALOG_STAGE9, Answers.ANSWERS_STAGE9), new Stage[] {}),

	/**
	 * Stage n°8
	 */
	STAGE8(new Choice(Dialog.DIALOG_STAGE8, Answers.ANSWERS_STAGE8), new Stage[] {}),

	/**
	 * Stage n°7
	 */
	STAGE7(new Choice(Dialog.DIALOG_STAGE7, Answers.ANSWERS_STAGE7), new Stage[] {}),

	/**
	 * Stage n°6
	 */
	STAGE6(new Choice(Dialog.DIALOG_STAGE6, Answers.ANSWERS_STAGE6), new Stage[] {}),

	/**
	 * Stage n°5
	 */
	STAGE5(new Choice(Dialog.DIALOG_STAGE5, Answers.ANSWERS_STAGE5), new Stage[] {}),

	/**
	 * Stage n°4
	 */
	STAGE4(new Choice(Dialog.DIALOG_STAGE4, Answers.ANSWERS_STAGE4), new Stage[] {}),

	/**
	 * Stage n°3
	 */
	STAGE3(new Choice(Dialog.DIALOG_STAGE3, Answers.ANSWERS_STAGE3), new Stage[] {}),

	/**
	 * Stage n°2
	 */
	STAGE2(new Choice(Dialog.DIALOG_STAGE2, Answers.ANSWERS_STAGE2), new Stage[] {}),

	/**
	 * Stage n°1
	 */
	STAGE1(new Choice(Dialog.DIALOG_STAGE1, Answers.ANSWERS_STAGE1), new Stage[] {});

	/**
	 * Accessible stages after this stage
	 */
	private Stage[] nextStages;

	/**
	 * Stage constructor with given Stage and given nextStages
	 * @param initialStage
	 * 			Stage to play
	 * @param initialNextStages
	 * 			Accessible stages after this stage
	 */
	private Tower(Stage initialStage, Stage[] initialNextStages)
	{
		this.nextStages = new Stage[initialNextStages.length];
		for (int i = 0; i < this.nextStages.length; i++)
			this.nextStages[i] = initialNextStages[i];
	}

	/**
	 * @return
	 */
	public Stage[] getNextStagesAt()
	{
		return this.nextStages;
	}
}
