; base skeleton code for writing

G28 ; Home all axes
G1 Z2 ; Move Z Axis up little to prevent scratching of Heat Bed
G1 X110 Y110 ; go to center
G0 Z0 ; lower to 0

; Stuff Go Here

G0 X110 Y110; go to char orgin
G0 Z0 ; lower to 0
G91 ; relitive positioning

; B
G0 X4.75 Y0 E0.2
G3 X0 Y6.5 I0 J3.25 E0.2
G0 X-3.75 Y0 E0.2
G0 X3.75 Y0 E0.2
G3 X0 Y6.5 I0 J3.25 E0.2
G0 X-4.75 Y0 E0.2
G1 Z1
G0 X1 E0
G0 Y-13 E0.2

G90 ; absolute positioning
G1 Z1 ; raise a bit

G1 Z10 ;Raise Z
G90 ;Absolute positioning
G1 X0 Y220 ;Present print
M84 X Y E ;Disable all steppers but Z