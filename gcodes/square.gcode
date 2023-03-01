; base skeleton code for writing

G28 ; Home all axes
G1 Z2 ; Move Z Axis up little to prevent scratching of Heat Bed
G1 X110 Y110 ; go to center
G0 Z0 ; lower to 0

; Stuff Go Here
G0 X110 Y110; got to char orgin
G0 Z0 ; lower to 0
G91
G0 X10 Y0
G0 X0 Y10
G0 X-10 Y0
G0 X0 Y-10
G90
G1 Z0.2 ; raise a bit

G1 Z10 ;Raise Z
G90 ;Absolute positioning
G1 X0 Y220 ;Present print
M84 X Y E ;Disable all steppers but Z
