package frc.robot.subsystems;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.CommandBase;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;



public class DriveTrain extends SubsystemBase{
    

    private final WPI_TalonSRX talon1 = 
        new WPI_TalonSRX(1);
    private final WPI_TalonSRX talon2 = 
        new WPI_TalonSRX(2);
    private final CANSparkMax spark1 =
        new CANSparkMax(3, CANSparkMaxLowLevel.MotorType.kBrushless);
    private final CANSparkMax spark2 =
        new CANSparkMax(4, CANSparkMaxLowLevel.MotorType.kBrushless);
    

    //spark ? more like the spark you ignite in my heart

    public void setMotors (DriveTrain DriveTrain, Double speed){
        talon1.setNeutralMode(NeutralMode.Coast);
        talon1.set(ControlMode.PercentOutput, speed);
        talon2.setNeutralMode(NeutralMode.Coast);
        talon2.set(ControlMode.PercentOutput, speed);
    }
}
