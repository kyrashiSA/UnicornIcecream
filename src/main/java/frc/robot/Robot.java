package frc.robot;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.PIDCommand;
import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends TimedRobot {
  private CANSparkMax motor1 = new CANSparkMax(0, MotorType.kBrushed);
  private CANSparkMax motor2 = new CANSparkMax(5, MotorType.kBrushed);
  
  // private CANEncoder encoder;
  private Joystick joystick = new Joystick(0);

  // private int count;
  // private double speed;
  // private PIDController controller = new PIDController(0.0004, 0.0004, 0.00001);

  @Override
  public void robotInit() {
    // motor = new CANSparkMax(1, MotorType.kBrushless);
    // motor.restoreFactoryDefaults();
    // encoder = motor.getEncoder();
  }

  @Override
  public void robotPeriodic() {
  //   SmartDashboard.putNumber("Position", encoder.getPosition());
  //   SmartDashboard.putNumber("Velocity", encoder.getVelocity());
  }

  @Override
  public void teleopPeriodic() {
  //   double setpoint = joystick.getRawButton(1) ? 4000 : 0;
  //   setpoint = joystick.getRawAxis(1) * 1000;
  //   // motor.set(joystick.getRawAxis(1));
  //   var feedforward = VelocityFF(setpoint);
  //   var feedback = controller.calculate(encoder.getVelocity(), setpoint);
  //   double output = feedforward;

  //   if (controller.getPositionError() < 100) {
  //     output += feedback;
  //   }
  //   motor.set(output);
  //   SmartDashboard.putNumber("Output", output);
  //   SmartDashboard.putNumber("Error", controller.getPositionError());
  double speed = joystick.getRawAxis(0);
  double turn = joystick.getRawAxis(5);
  double leftSpeed = speed + turn;
  double rightSpeed = speed - turn;

  motor1.set(leftSpeed);
  motor2.set(rightSpeed);

  }

  @Override
  public void autonomousInit() {
    // count = 0;
    // speed = 0;
  }

  @Override
  public void autonomousPeriodic() {
    // count += 1;
    // motor.set(speed);
    // if (count == 100) {
    //   count = 0;
    //   System.out.println(speed + " " + encoder.getVelocity() + ";");
    //   speed += 0.1;
    // }
  }

  // private double VelocityFF(double vel) {
  //   return 0.000169700939956177 * vel;// + -0.0004 * Math.signum(vel);
  // }

  // private static double elocityFF(double vel) {
  // return 0.000169700939956177 * vel;
  // }

  // public static void main(String[] args) {
  // System.out.println(elocityFF(4000.0));
  // }
}