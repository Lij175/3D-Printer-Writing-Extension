; base skeleton code for writing

G28 ; Home all axes
G1 Z2 ; Move Z Axis up little to prevent scratching of Heat Bed
; Stuff Go Here

G0 X110 Y110; go to char orgin
G0 Z0 ; lower to 0
G91 ; relitive positioning

; J
G1 Z1 
G0 X4 Y13 E0
G1 Z-1
G0 X4 E0.2
G1 Z1
G0 X-2
G1 Z-1
G0 Y-10 E0.2
G0 X-0.0237 Y-0.376 E0.2
G0 X-0.0706 Y-0.3701 E0.2
G0 X-0.1164 Y-0.3583 E0.2
G0 X-0.1604 Y-0.3409 E0.2
G0 X-0.2018 Y-0.3181 E0.2
G0 X-0.2402 Y-0.2902 E0.2
G0 X-0.2746 Y-0.2579 E0.2
G0 X-0.3048 Y-0.2215 E0.2
G0 X-0.3302 Y-0.1815 E0.2
G0 X-0.3502 Y-0.1387 E0.2
G0 X-0.365 Y-0.0937 E0.2
G0 X-0.3737 Y-0.0472 E0.2
G0 X-0.3768 Y0.0 E0.2
G0 X-0.3737 Y0.0472 E0.2
G0 X-0.365 Y0.0937 E0.2
G0 X-0.3502 Y0.1387 E0.2
G0 X-0.3302 Y0.1815 E0.2
G0 X-0.3048 Y0.2215 E0.2
G0 X-0.2746 Y0.2579 E0.2
G0 X-0.2402 Y0.2902 E0.2
G0 X-0.2018 Y0.3181 E0.2
G0 X-0.1604 Y0.3409 E0.2
G0 X-0.1164 Y0.3583 E0.2
G0 X-0.0706 Y0.3701 E0.2
G0 X-0.0237 Y0.376 E0.2


G90 ; absolute positioning
G1 Z1 ; raise a bit

G1 Z10 ;Raise Z
G90 ;Absolute positioning
G1 X0 Y220 ;Present print
M84 X Y E ;Disable all steppers but Z